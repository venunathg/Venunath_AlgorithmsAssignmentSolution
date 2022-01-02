package com.gl.dsalgorithm;

import java.util.Scanner;

import com.gl.algorithmassignment.service.LinearSearch;
import com.gl.algorithmassignment.service.MergeSort;

public class Driver {

		private static Scanner sc = new Scanner(System.in); 
		static double[] shareOfEachCompany;
		static int numberOfCompanies;
	
		public static void main(String[] args) {
		

			MergeSort mergeSort = new MergeSort();
			LinearSearch linearSearch = new LinearSearch();
			

			System.out.println("enter the no of companies");
			numberOfCompanies = sc.nextInt();
			boolean status;
			int profitCompanies=0, lossCompanies =0;
			shareOfEachCompany= new double[numberOfCompanies];
			
			if(numberOfCompanies == 1)
			{
				System.out.println("Enter current stock price of the Company 1");
				shareOfEachCompany[0] = sc.nextDouble();
				System.out.println("Whether company's stock price rose today compare to yesterday? (Mention True or False)");
				status = sc.nextBoolean();
				if(status)
				{
					profitCompanies ++;
				}
				if(!status)
				{
					lossCompanies ++;
				}
			}
			else
			{
				for(int i=0; i< numberOfCompanies; i++)
				{
					System.out.println("Enter current stock price of the company "+(i+1));
					shareOfEachCompany[i] = sc.nextDouble();
					System.out.println("Whether company's stock price rose today compare to yesterday? (Mention True or False)");
					status = sc.nextBoolean();
					if(status)
					{
						profitCompanies ++;
					}
					if(!status)
					{
						lossCompanies ++;
					}
				}
			}
			

			
			int option = Integer.MIN_VALUE;
			while(option != 0)
			{
			System.out.println("");
			System.out.println("-----------------------------------");
			System.out.println("Enter the operation that you want to perform");
			System.out.println("1. Display the companies stock prices in ascending order");
			System.out.println("2. Display the companies stock prices in descending order");
			System.out.println("3. Display the total no of companies for which stock prices rose today");
			System.out.println("4. Display the total no of companies for which stock prices declined today");
			System.out.println("5. Search a specific stock price");
			System.out.println("6. press 0 to exit");
			System.out.println("-----------------------------------------------");
			option = sc.nextInt();
			 
			switch (option)
			{
			case 1:
				mergeSort.sort(shareOfEachCompany,0,numberOfCompanies-1,1);
				System.out.println("Stock prices in ascending order are :");
				Driver.displayStocks();
				break;
			case 2:
				mergeSort.sort(shareOfEachCompany,0,numberOfCompanies-1,2);
				System.out.println("Stock prices in descending order are :");
				Driver.displayStocks();
				break;
			case 3:
				System.out.println("Total no of companies whose stock price rose today : "+profitCompanies);
				break;
			case 4 :
				System.out.println("Total no of companies whose stock price declined today : "+lossCompanies);
				break;
			case 5 :
				System.out.println("enter the key value");
				double valueToSearch = sc.nextDouble();
				int result = linearSearch.search(valueToSearch,shareOfEachCompany);
				if(result == -1)
				{
					System.out.println("Value not found");
				}
				else
				{
					System.out.println("Stock of value "+valueToSearch+" is present");				
				}
				break;
			default:
				break;
			}		
			}

		}
		

		
		public static void displayStocks()
		{
			for(int i=0; i< numberOfCompanies;i++)
			{
				System.out.print(shareOfEachCompany[i] +" ");
			}
			System.out.println("");
		}

	}
