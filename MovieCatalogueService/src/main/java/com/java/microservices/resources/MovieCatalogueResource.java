package com.java.microservices.resources;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.microservices.model.CatalogueItem;

@RestController
@RequestMapping("/catalogue")
public class MovieCatalogueResource {

	@GetMapping("/{userId}")
	public List<CatalogueItem> getCatalog(@PathVariable("userId") String userId) {

		return Collections.singletonList(new CatalogueItem("Aspirants", "Best Show Ever", 5));

	}

}
