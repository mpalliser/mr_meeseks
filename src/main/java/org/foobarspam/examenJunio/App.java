package org.foobarspam.examenJunio;

import java.util.ArrayList;

import org.foobarspam.examenJunio.box.mrmeeseks.MrMeeseeks;
import org.foobarspam.examenJunio.box.mrmeeseks.ProxyMrMeeseeks;

/**
 * Hello world!
 *
 */
public class App {
		
		public static void main( String[] args ){
	        
			ArrayList<MrMeeseeks> setMrMe = new ArrayList<MrMeeseeks>();
			ArrayList <Integer> ids = new ArrayList<Integer>();
			
			// Crea una estructura de datos llamada setMrMe donde almacenar los Mr Meeseeks creados
			// Crea una estructura de datos llamada ids donde almacenar los ids de los Mr Meeseeks creados
			        
			ProxyMrMeeseeks box = new ProxyMrMeeseeks();
			       
			box.pushButton(setMrMe);
			System.out.println("Open Jerry's stupid mayonnaise jar");
			box.getMrMe().formulateRequest("Open", "stupid jar");
			System.out.println();
			
			box.pushButton(setMrMe);    
			System.out.println("I wanna be popular at school!");
			box.getMrMe().formulateRequest("Be", "popular at school");
			System.out.println();
			
			box.pushButton(setMrMe);
			System.out.println("I wanna be a more complete woman!");
			box.getMrMe().formulateRequest("Be", "a more complete woman");
			System.out.println();
			
			System.out.println("Estos son los Mr Meeseeks creados:");
			listMrMeeseeks(setMrMe);
			System.out.println();
			
			collectIds(setMrMe, ids);
			
			System.out.println("Adios, Mr Meeseeks...");
			for(Integer id : ids){
				explodeMrMeeseeks(setMrMe, id);   
			}
			
		}

			/* collectIds(setMrMe, ids)
			 * Almacena en un array los ids de los Mr Meeseeks creados
			 */

			/* listMrMeeseeks(setMrMe)
			 * Lista los ids de todos los Mr Meeseeks creados
			 */

			/* explodeMrMeeseeks(setMrMe, id)
			 * elimna del conjunto de Mr Meeseeks creados el que ya ha completado su cometido
			 */	

		private static void listMrMeeseeks(ArrayList<MrMeeseeks> setMrMe) {
			
			for(MrMeeseeks mrme : setMrMe) {
				System.out.println(mrme.getId());
			}
		}

		private static void collectIds(ArrayList<MrMeeseeks> setMrMe, ArrayList<Integer> ids) {
			
			for(MrMeeseeks mrme : setMrMe) {
				ids.add(mrme.getId());
			}
		}
		
		private static void explodeMrMeeseeks(ArrayList<MrMeeseeks> setMrMe, Integer id) {
			
			for (MrMeeseeks mrme : setMrMe){
				//comprueba que la id de la array  coincide con un meeseeks listo para borrar.
				if( mrme.getId().equals(id)) {
					mrme.sayMessageOnExplode();
					setMrMe.remove(mrme);
					break;
				}
			}
		}

	}

