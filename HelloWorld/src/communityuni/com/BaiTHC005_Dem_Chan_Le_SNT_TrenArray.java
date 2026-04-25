package communityuni.com;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BaiTHC005_Dem_Chan_Le_SNT_TrenArray {

    public static void main(String[] args) {
    	try {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử của mảng: ");
        int nSize = sc.nextInt();
        int[] M = new int[nSize];

        for (int i = 0; i < nSize; i++) {
            System.out.print("M[" + i + "] = ");
            M[i] = sc.nextInt();
        }

        
        List<Integer> oddList = new ArrayList<>();
        List<Integer> evenList = new ArrayList<>();
        List<Integer> primeList = new ArrayList<>();
        List<Integer> nonPrimeList = new ArrayList<>();

        
        for (int num : M) {
           
            if (num % 2 == 0) {
                evenList.add(num);
            } else {
                oddList.add(num);
            }

           
            boolean isPrime = true;
            if (num < 2) {
                isPrime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                primeList.add(num);
            } else {
                nonPrimeList.add(num);
            }
        }

       
        List<List<Integer>> groups = List.of(oddList, evenList, primeList, nonPrimeList);
        String[] titles = {"Dòng 1 (Lẻ)", "Dòng 2 (Chẵn)", "Dòng 3 (SNT)", "Dòng 4 (Ko SNT)"};

        System.out.println("\n--- KẾT QUẢ ---");
        for (int i = 0; i < groups.size(); i++) {
            List<Integer> currentList = groups.get(i);
            
          
            Map<Integer, Integer> countMap = new LinkedHashMap<>();
            for (int x : currentList) {
                countMap.put(x, countMap.getOrDefault(x, 0) + 1);
            }

            
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
                sb.append(entry.getKey());
                if (entry.getValue() > 1) {
                    sb.append("(").append(entry.getValue()).append(")");
                }
                sb.append(", ");
            }

            
            String output = sb.length() > 0 ? sb.substring(0, sb.length() - 2) : "Trống";

            
            if (i == 0) {
                System.out.println(titles[i] + ": " + output + " -> tổng cộng có " + currentList.size() + " số lẻ.");
            } else if (i == 1) {
                System.out.println(titles[i] + ": " + output + " -> tổng cộng có " + currentList.size() + " số chẵn.");
            } else {
                System.out.println(titles[i] + ": " + output);
            }
        }
        
        sc.close();
    }
    	catch(Exception ex)
    	{
    		ex.printStackTrace();
    	}
    	finally
    	{
    		System.out.println("finally");
    	}
    }
    	
    	
    	
}