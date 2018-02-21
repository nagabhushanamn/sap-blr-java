package com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Q2 {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("records.csv");
		BufferedReader br = new BufferedReader(fr);
		Map<String, Double> map = new HashMap<>();
		String record = null;
		while ((record = br.readLine()) != null) {
			if (!record.isEmpty()) {
				String[] tokens = record.split("[,]");
				String dep = tokens[1];
				double empSalary = Double.parseDouble(tokens[2]);
				if (!map.containsKey(dep)) {
					map.put(dep, empSalary);
				} else {
					double totalSalary = map.get(dep);
					totalSalary += empSalary;
					map.put(dep, totalSalary);
				}
			}
		}
		Set<String> set = map.keySet();
		for (String dep : set) {
			System.out.println(dep + " : " + map.get(dep));
		}

		br.close();
		fr.close();

	}

}
