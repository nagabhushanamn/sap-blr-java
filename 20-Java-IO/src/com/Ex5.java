package com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex5 {

	public static void main(String[] args) {


		try (FileReader fr = new FileReader("dir/data.txt");
				BufferedReader br=new BufferedReader(fr)) { 

			String line=null;
			while((line=br.readLine())!=null){
				System.out.println(line);
			}

			// stream closed
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
