
public class MedicalMapper extends Laboratory implements Mapping, Comparable<MedicalMapper>{

     double BMI =getBMI();
     public int compareTo(MedicalMapper mm){//must override
       if(getTotal()==mm.getTotal())
       return 0;
       else if(getTotal()>mm.getTotal())
       return 1;
       else return -1; 
      

     }
      
       

       public  double mapBMI(){// return type double ?
        if(BMI<=0 && BMI<=17.9)
          return 0;
          else if(BMI>=18 && BMI<=24.9)
          return 1;
          else if(BMI>=25 && BMI<=29.9)
          return 2;
          else return 3;
      
         
        
      }
      public int mapBloodPressure(){// int type 
          if(spb<130 && dpb<=80)
         return 1;
          else if(spb<=130 &&dpb==80)
          return 2;
          else if(spb>130&& dpb<100)
          return 3;
          else if(spb>150 && dpb>100)
          return 4;
          else return 5;
          
      }
      public double mapFBS( int fbs){// return type double 
          if(fbs<=70 && fbs<=110)
          return 1;
          else if(fbs>=111 && fbs<=140)
          return 2;
          else if(fbs>=141 && fbs<=200)
          return 3;
          else if(fbs>=201 && fbs<=300)
          return 4;
            else return 5;
      }
      public  int mapChol(double chol){// return type double?
        if(chol<=50 && chol<=149)
        return 1;
        else if(chol>=150&& chol<=184)
        return 2;
        else if(chol>=185 && chol<=199)
        return 3 ;
        else if(chol>=200 && chol<=249)
        return 4;
        else return 5;
      }
      public int mapHDL(double hdl){
        if(hdl==0 && hdl<=39)
        return 5;
        else if (hdl>=40 && hdl<=59)
        return 4;
        else if(hdl>=60 && hdl<=74)
        return 3;
        else if(hdl>=75 && hdl<=99)
        return 2;
        else return 1;


      }
      public double mapLDL(int ldl){
       if(ldl>=0 && ldl<=99)
          return 1;
          else if(ldl>=100 &&ldl<=129)
          return 2;
          else if(ldl>=130 &&ldl<=159)
          return 3;
          else if( ldl>=160 && ldl<=189)
          return 4;
          else  return 5;
      }
      public double getTG(int tg){
          if(tg==0 && tg<=149)
          return 1;
          else if(tg>=150 && tg<=179)
          return 2;
          else if(tg>=180 && tg<=199)
          return 3;
          else if(tg>=200 && tg<=499)
          return 4;
          else return 5;
      }

      public double mapHB1AC(int hba1c){

        if(hba1c>=4 &&hba1c<=6)
      return 1;
        else if(hba1c>=6.1 && hba1c<=6.9)
        return 2;
        else if(hba1c>=6.9 && hba1c<=8)
        return 3;
        else if(hba1c>=8.1 && hba1c<=9)
        return 4;
        else return 5;
      }






      public char ConvertGender(int gender){
        if(gender==2)
        return 'F';
        else 
        return 'M';


      }



      public int getTotal(){
    	  MedicalMapper m1 = new MedicalMapper();
        int sum= m1.mapBloodPressure()+m1.mapChol(chol)+m1.mapHDL(hdl);
        double sum2=m1.mapBMI()+m1.mapFBS((int)fbs)+m1.mapHB1AC((int)hba1c)+m1.getTG((int)tg) + m1.mapLDL((int)ldl);
        int allsum= sum+(int)sum2;
        return allsum;
      }
    



  
    }
     interface Mapping
    {
      public  double mapBMI();
      public  int mapBloodPressure();
      public double mapFBS(int fbs);
      public  int mapChol(double chol);
      public int mapHDL(double hdl);
      public double mapLDL(int ldl);
      public double getTG(int tg);
      public double mapHB1AC(int hba1c);



    }
