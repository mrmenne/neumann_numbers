/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neumannnumbers;

import java.util.ArrayList;

/**
 *
 * @author matthias
 */
public class NeumannNumbers {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {

		if (args.length < 1){
			System.out.print("Muss mit einer Ganzzahl als Argument aufgerufen werden\n");
			
			return;
		}
		
		int number;
		
		try{
			number = Integer.parseInt(args[0]);
		}
		catch (NumberFormatException pExecption){
			System.out.print("Muss mit einer Ganzzahl als Argument aufgerufen werden\n");
			
			return ;
		}
		
		ArrayList<String> NumberList = new ArrayList<>();

		NumberList.add("{}");
		
		for (int i = 1; i <= number; i++){
			String currentNumber = "{";

			for (String previousNumber : NumberList){
				currentNumber += previousNumber + ",";
			}

			String currentNumberNoTrailingComma = currentNumber.replaceAll(",$", "}");
			
			NumberList.add(currentNumberNoTrailingComma);
		}
		
		String neumannRepresentation = NumberList.get(number);
		System.out.print("Ergebnis: "+neumannRepresentation+"\n");
	}

}
