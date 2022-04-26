package MoreExercises;

import java.util.Scanner;

class NestedLoops{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // int n = Integer.parseInt(scanner.nextLine());
        // LuckyNumbers luckyNumbers = new LuckyNumbers();
        // luckyNumbers.GenerateLuckyNumbers(n);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        CarNumber carNumber = new CarNumber();
        carNumber.GenerateCarNumbers(start, end);
    }

    
}

//zad 1
class UniquePINCodes{
    public void GeneratePassword(int firstNum, int secontNum, int thurdNum){
        for(int i = 2; i <= firstNum; i+=2){
            for(int j = 1; j <= secontNum; j++){
                if(isPrime(j)){
                    for(int k = 2; k <= thurdNum; k+=2){
                        System.out.println(i + " " + j + " " + k);
                    }
                }
            }
        }
    }

    public boolean isPrime(int num){
        if(num <= 1)
            return false;
        if(num <= 3)
            return true;
        
        if(num % 2 == 0 || num % 3 == 0)
            return false;

            for (int i = 5; i * i <= num; i = i + 6)
                if (num % i == 0 || num % (i + 2) == 0)
                    return false;
  
        return true;
    }
}

//zad 3
class LuckyNumbers{
    public void GenerateLuckyNumbers(int n) {
        for(int first = 1; first <= 9; first++){
            for(int secont = 1; secont <= 9; secont++){
                for(int thurd = 1; thurd <= 9; thurd++){
                    for(int fourth = 1; fourth <= 9; fourth++){
                        if((first + secont == thurd + fourth) && (n % (first + secont) == 0)){
                            System.out.print(first + "" + secont + "" + thurd + "" + fourth + ' ');
                        }
                    }
                }
            }
        }
    }
}

//zad 4
class CarNumber {
    public void GenerateCarNumbers(int start, int end) {
        for(int first = start; first <= end; first++){
            for(int secont = start; secont <= end; secont++){
                for(int thurd = start; thurd <= end; thurd++){
                    for(int fourth = start; fourth <= end; fourth++){
                        if((first % 2 == 0 && fourth % 2 == 1) || (first % 2 == 1 && fourth % 2 == 0)){
                            if(first > fourth){
                                if((secont + thurd) % 2 == 0){
                                    System.out.print(first + "" + secont + "" + thurd + "" + fourth + " ");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

//zad 5
class ChallengeTheWedding {
    public void Machmaker(int men, int women, int tables){
        int neededtables = men * women;
        while(tables != 0 && neededtables != 0){
            for(int i = 1; i <= men; i++){
                for(int j = 1; j <= women; j++){
                    System.out.printf("(%d <-> %d) ", i, j);
                    tables--;
                    neededtables--;
                    if(neededtables == 0 || tables == 0)
                        break;
                    
                }
            }
        }
    }
}