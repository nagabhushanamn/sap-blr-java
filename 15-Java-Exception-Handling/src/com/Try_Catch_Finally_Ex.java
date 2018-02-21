package com;

import java.io.Closeable;
import java.io.FileReader;

// obj which communicate to external world ( os , dbms , n/w )
class Resource implements Closeable {

	public void init() {
		System.out.println("init.....");
	}

	public void use() {
		System.out.println("using.....");
		int v = 200;
		if (v == 100)
			throw new RuntimeException();
		System.out.println("used....");
	}

	public void close() {
		System.out.println("close....");
	}
}

public class Try_Catch_Finally_Ex {

	public static void main(String[] args) {

		// System.out.println("-------------------------");
		// Resource resource = new Resource();
		// resource.init();
		// try {
		// resource.use();
		// // resource.close();
		// } catch (RuntimeException e) {
		// // resource.close();
		// System.out.println("Handled Ex while using resource.");
		// } finally {
		// resource.close(); // to cleanup any used resources
		// }
		// System.out.println("-------------------------");

		// -------------------------------------------------

		// from JSK 1.7

		// try(Resource resource=new Resource()){
		// resource.init();
		// resource.use();
		// }catch (Exception e) {
		// System.out.println("Ex-"+e.getMessage());
		// }
		//

		// ---------------------------------------------------

		try {

		} catch (Exception e) {
			// TODO: handle exception
		}

		try {

		} finally {

		}

		try {
			try {

			} catch (Exception e) {
				// TODO: handle exception
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		try {

		} finally {
			try {

			} catch (Exception e) {
				// TODO: handle exception
			} finally {

			}
		}
		
		//-----------------------------------------
		
		try(FileReader fr=new FileReader("");Resource resource=new Resource()) {
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		

	}

}
