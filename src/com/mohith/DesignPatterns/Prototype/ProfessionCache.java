package com.mohith.DesignPatterns.Prototype;

import java.util.Hashtable;

public class ProfessionCache {
	private static Hashtable<Integer, Profession> professionCacheMap = new Hashtable<Integer, Profession>();

	public static Profession getCloneNewProfession(int id) {
		Profession cachedProfession = professionCacheMap.get(id);
		return (Profession) cachedProfession.cloneMethod();
	}

	public static void loadProfessionCache() {
		Doctor doctor = new Doctor();
		doctor.id = 1;
		professionCacheMap.put(doctor.id, doctor);
		Engineer engineer = new Engineer();
		engineer.id = 2;
		professionCacheMap.put(engineer.id, engineer);
	}
}
