package com.kosmos.test.citas.controllers;

import com.google.gson.Gson;
import com.kosmos.test.citas.Objects.CitasObj;
import com.kosmos.test.citas.entities.Citas;
import com.kosmos.test.citas.repos.CitasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
public class CitasController {
	@Autowired
	private CitasRepository citasRepository;
	@GetMapping("/citas")
	public String getCitas() {
		List<Citas> citas = citasRepository.findAll();
		Gson gson = new Gson();
		return gson.toJson(citas);
	}
	@PostMapping("/nuevaCita")
	public String InsertCita(@RequestBody String request) throws ParseException {
		Gson gson = new Gson();
		CitasObj obj = gson.fromJson(request,CitasObj.class);
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();
		Citas newcita = new Citas(obj.getConsultorio(), obj.getNombre_doctor(), dateFormat.parse(obj.getHora_cita()), obj.getNombre_paciente(),false
		);
		citasRepository.save(newcita);
		return "¡Guardado!";
	}

	@PostMapping("/cancelarCita")
	public String CancelCita(@RequestBody String request) {
		Citas cita = citasRepository.getById(52l);
		cita.setCancelada(true);
		citasRepository.save(cita);
		Gson gson = new Gson();
		return "¡Cancelada con exito!";
	}

	@PostMapping("/modificarCita")
	public String ModifyCita() {
		List<Citas> citas = citasRepository.findAll();
		Gson gson = new Gson();
		return gson.toJson(citas);
	}
}
