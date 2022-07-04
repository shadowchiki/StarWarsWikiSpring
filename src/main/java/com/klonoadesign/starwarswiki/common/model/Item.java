package com.klonoadesign.starwarswiki.common.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Item {

	private String created;
	private String edited;
	private String url;
	private String image;
	private String title;
	@JsonProperty("episode_id")
	private String episodeId;
	@JsonProperty("opening_crowl")
	private String openingCrowl;
	private String director;
	private String producer;
	@JsonProperty("release_date")
	private String releaseDate;
	private List<String> characters;
	private List<String> planets;
	@JsonProperty("cargo_capacity")
	private String cargoCapacity;
	private String consumables;
	@JsonProperty("cor_in_credits")
	private String costInCredits;
	private String crew;
	private String editec;
	private String length;
	@JsonProperty("many_facturer")
	private String manufacturer;
	@JsonProperty("max_atmosphering_speed")
	private String maxAtmospheringSpeed;
	private String model;
	private String passengers;
	private List<String> pilots;
	@JsonProperty("bidth_year")
	private String birdthYear;
	@JsonProperty("eye_color")
	private String eyeColor;
	private String gender;
	@JsonProperty("hair_color")
	private String hairColor;
	private String heigth;
	@JsonProperty("home_world")
	private String homeWorld;
	private String mass;
	@JsonProperty("skin_color")
	private String skinColor;
	private List<String> species;
	private List<String> starships;
	private List<String> vehicles;
	private String climate;
	private String diameter;
	private String gravity;
	@JsonProperty("orbital_period")
	private String orbitalPeriod;
	private String population;
	private List<String> residents;
	@JsonProperty("rotation_period")
	private String rotationPeriod;
	@JsonProperty("surface_water")
	private String surfaceWater;
	private String terrain;
	private String name;
	private String classifi;
	private String designation;
	@JsonProperty("average_height")
	private String averageHeight;
	@JsonProperty("skin_colors")
	private String skinColors;
	@JsonProperty("hair_colors")
	private String hairColors;
	@JsonProperty("eye_colors")
	private String eyeColors;
	@JsonProperty("average_cifespan")
	private String averageCifespan;
	private String homeworld;
	private String language;
	private List<String> people;
	private List<String> films;
	private String starshipClass;
	private String vehicleClass;

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public String getEdited() {
		return edited;
	}

	public void setEdited(String edited) {
		this.edited = edited;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEpisodeId() {
		return episodeId;
	}

	public void setEpisodeId(String episodeId) {
		this.episodeId = episodeId;
	}

	public String getOpeningCrowl() {
		return openingCrowl;
	}

	public void setOpeningCrowl(String openingCrowl) {
		this.openingCrowl = openingCrowl;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public List<String> getCharacters() {
		return characters;
	}

	public void setCharacters(List<String> characters) {
		this.characters = characters;
	}

	public List<String> getPlanets() {
		return planets;
	}

	public void setPlanets(List<String> planets) {
		this.planets = planets;
	}

	public String getCargoCapacity() {
		return cargoCapacity;
	}

	public void setCargoCapacity(String cargoCapacity) {
		this.cargoCapacity = cargoCapacity;
	}

	public String getConsumables() {
		return consumables;
	}

	public void setConsumables(String consumables) {
		this.consumables = consumables;
	}

	public String getCostInCredits() {
		return costInCredits;
	}

	public void setCostInCredits(String costInCredits) {
		this.costInCredits = costInCredits;
	}

	public String getCrew() {
		return crew;
	}

	public void setCrew(String crew) {
		this.crew = crew;
	}

	public String getEditec() {
		return editec;
	}

	public void setEditec(String editec) {
		this.editec = editec;
	}

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getMaxAtmospheringSpeed() {
		return maxAtmospheringSpeed;
	}

	public void setMaxAtmospheringSpeed(String maxAtmospheringSpeed) {
		this.maxAtmospheringSpeed = maxAtmospheringSpeed;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getPassengers() {
		return passengers;
	}

	public void setPassengers(String passengers) {
		this.passengers = passengers;
	}

	public List<String> getPilots() {
		return pilots;
	}

	public void setPilots(List<String> pilots) {
		this.pilots = pilots;
	}

	public String getBirdthYear() {
		return birdthYear;
	}

	public void setBirdthYear(String birdthYear) {
		this.birdthYear = birdthYear;
	}

	public String getEyeColor() {
		return eyeColor;
	}

	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHairColor() {
		return hairColor;
	}

	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}

	public String getHeigth() {
		return heigth;
	}

	public void setHeigth(String heigth) {
		this.heigth = heigth;
	}

	public String getHomeWorld() {
		return homeWorld;
	}

	public void setHomeWorld(String homeWorld) {
		this.homeWorld = homeWorld;
	}

	public String getMass() {
		return mass;
	}

	public void setMass(String mass) {
		this.mass = mass;
	}

	public String getSkinColor() {
		return skinColor;
	}

	public void setSkinColor(String skinColor) {
		this.skinColor = skinColor;
	}

	public List<String> getSpecies() {
		return species;
	}

	public void setSpecies(List<String> species) {
		this.species = species;
	}

	public List<String> getStarships() {
		return starships;
	}

	public void setStarships(List<String> starships) {
		this.starships = starships;
	}

	public List<String> getVehicles() {
		return vehicles;
	}

	public void setVehicles(List<String> vehicles) {
		this.vehicles = vehicles;
	}

	public String getClimate() {
		return climate;
	}

	public void setClimate(String climate) {
		this.climate = climate;
	}

	public String getDiameter() {
		return diameter;
	}

	public void setDiameter(String diameter) {
		this.diameter = diameter;
	}

	public String getGravity() {
		return gravity;
	}

	public void setGravity(String gravity) {
		this.gravity = gravity;
	}

	public String getOrbitalPeriod() {
		return orbitalPeriod;
	}

	public void setOrbitalPeriod(String orbitalPeriod) {
		this.orbitalPeriod = orbitalPeriod;
	}

	public String getPopulation() {
		return population;
	}

	public void setPopulation(String population) {
		this.population = population;
	}

	public List<String> getResidents() {
		return residents;
	}

	public void setResidents(List<String> residents) {
		this.residents = residents;
	}

	public String getRotationPeriod() {
		return rotationPeriod;
	}

	public void setRotationPeriod(String rotationPeriod) {
		this.rotationPeriod = rotationPeriod;
	}

	public String getSurfaceWater() {
		return surfaceWater;
	}

	public void setSurfaceWater(String surfaceWater) {
		this.surfaceWater = surfaceWater;
	}

	public String getTerrain() {
		return terrain;
	}

	public void setTerrain(String terrain) {
		this.terrain = terrain;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClassifi() {
		return classifi;
	}

	public void setClassifi(String classifi) {
		this.classifi = classifi;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getAverageHeight() {
		return averageHeight;
	}

	public void setAverageHeight(String averageHeight) {
		this.averageHeight = averageHeight;
	}

	public String getSkinColors() {
		return skinColors;
	}

	public void setSkinColors(String skinColors) {
		this.skinColors = skinColors;
	}

	public String getHairColors() {
		return hairColors;
	}

	public void setHairColors(String hairColors) {
		this.hairColors = hairColors;
	}

	public String getEyeColors() {
		return eyeColors;
	}

	public void setEyeColors(String eyeColors) {
		this.eyeColors = eyeColors;
	}

	public String getAverageCifespan() {
		return averageCifespan;
	}

	public void setAverageCifespan(String averageCifespan) {
		this.averageCifespan = averageCifespan;
	}

	public String getHomeworld() {
		return homeworld;
	}

	public void setHomeworld(String homeworld) {
		this.homeworld = homeworld;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public List<String> getPeople() {
		return people;
	}

	public void setPeople(List<String> people) {
		this.people = people;
	}

	public List<String> getFilms() {
		return films;
	}

	public void setFilms(List<String> films) {
		this.films = films;
	}

	public String getStarshipClass() {
		return starshipClass;
	}

	public void setStarshipClass(String starshipClass) {
		this.starshipClass = starshipClass;
	}

	public String getVehicleClass() {
		return vehicleClass;
	}

	public void setVehicleClass(String vehicleClass) {
		this.vehicleClass = vehicleClass;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Item [created=");
		builder.append(created);
		builder.append(", edited=");
		builder.append(edited);
		builder.append(", url=");
		builder.append(url);
		builder.append(", image=");
		builder.append(image);
		builder.append(", title=");
		builder.append(title);
		builder.append(", episodeId=");
		builder.append(episodeId);
		builder.append(", openingCrowl=");
		builder.append(openingCrowl);
		builder.append(", director=");
		builder.append(director);
		builder.append(", producer=");
		builder.append(producer);
		builder.append(", releaseDate=");
		builder.append(releaseDate);
		builder.append(", characters=");
		builder.append(characters);
		builder.append(", planets=");
		builder.append(planets);
		builder.append(", cargoCapacity=");
		builder.append(cargoCapacity);
		builder.append(", consumables=");
		builder.append(consumables);
		builder.append(", costInCredits=");
		builder.append(costInCredits);
		builder.append(", crew=");
		builder.append(crew);
		builder.append(", editec=");
		builder.append(editec);
		builder.append(", length=");
		builder.append(length);
		builder.append(", manufacturer=");
		builder.append(manufacturer);
		builder.append(", maxAtmospheringSpeed=");
		builder.append(maxAtmospheringSpeed);
		builder.append(", model=");
		builder.append(model);
		builder.append(", passengers=");
		builder.append(passengers);
		builder.append(", pilots=");
		builder.append(pilots);
		builder.append(", birdthYear=");
		builder.append(birdthYear);
		builder.append(", eyeColor=");
		builder.append(eyeColor);
		builder.append(", gender=");
		builder.append(gender);
		builder.append(", hairColor=");
		builder.append(hairColor);
		builder.append(", heigth=");
		builder.append(heigth);
		builder.append(", homeWorld=");
		builder.append(homeWorld);
		builder.append(", mass=");
		builder.append(mass);
		builder.append(", skinColor=");
		builder.append(skinColor);
		builder.append(", species=");
		builder.append(species);
		builder.append(", starships=");
		builder.append(starships);
		builder.append(", vehicles=");
		builder.append(vehicles);
		builder.append(", climate=");
		builder.append(climate);
		builder.append(", diameter=");
		builder.append(diameter);
		builder.append(", gravity=");
		builder.append(gravity);
		builder.append(", orbitalPeriod=");
		builder.append(orbitalPeriod);
		builder.append(", population=");
		builder.append(population);
		builder.append(", residents=");
		builder.append(residents);
		builder.append(", rotationPeriod=");
		builder.append(rotationPeriod);
		builder.append(", surfaceWater=");
		builder.append(surfaceWater);
		builder.append(", terrain=");
		builder.append(terrain);
		builder.append(", name=");
		builder.append(name);
		builder.append(", classifi=");
		builder.append(classifi);
		builder.append(", designation=");
		builder.append(designation);
		builder.append(", averageHeight=");
		builder.append(averageHeight);
		builder.append(", skinColors=");
		builder.append(skinColors);
		builder.append(", hairColors=");
		builder.append(hairColors);
		builder.append(", eyeColors=");
		builder.append(eyeColors);
		builder.append(", averageCifespan=");
		builder.append(averageCifespan);
		builder.append(", homeworld=");
		builder.append(homeworld);
		builder.append(", language=");
		builder.append(language);
		builder.append(", people=");
		builder.append(people);
		builder.append(", films=");
		builder.append(films);
		builder.append(", starshipClass=");
		builder.append(starshipClass);
		builder.append(", vehicleClass=");
		builder.append(vehicleClass);
		builder.append("]");
		return builder.toString();
	}

}
