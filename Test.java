import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;



public class Test {
    
   static int PatientID = 0,Age =0,Gender=0,spb=0,dpb=0,fbs=0;
   static double chol=0.0,hdl=0.0,Weight=0.0,Height=0.0,ldl=0.0,tg=0.0,hba1c=0;
   static MedicalMapper mm = new MedicalMapper();
	public static void main(String[] args) {
       readfile();
       writefile();
   }
         
    public static void readfile() 
	{
		
    	 try {
		      File myObj = new File("MedicalRecord.txt");
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) { 
		    	  PatientID= Integer.parseInt(myReader.nextLine());
		           Age = Integer.parseInt(myReader.nextLine());
		           Gender=Integer.parseInt(myReader.nextLine());
		           Weight= Double.parseDouble(myReader.nextLine());
		           Height= Double.parseDouble(myReader.nextLine());
		           spb= Integer.parseInt(myReader.nextLine());
		           dpb=Integer.parseInt(myReader.nextLine());
		           fbs=Integer.parseInt(myReader.nextLine());
		           chol=Double.parseDouble(myReader.nextLine());
		           hdl=Double.parseDouble(myReader.nextLine());
		           ldl=Double.parseDouble(myReader.nextLine());;
		           tg=Double.parseDouble(myReader.nextLine());
		           hba1c=Double.parseDouble(myReader.nextLine());
		          
		      }
		      myReader.close();
		      Patient.Height=Height;
		      Patient.Weight=Weight;
		      mm.Age=Age;
		      mm.chol=chol;
		      mm.dpb=dpb;
		      mm.fbs=fbs;
		      mm.Gender=Gender;
		      mm.hba1c=hba1c;
		      mm.hdl=hdl;
		      mm.ldl=ldl;
		      mm.spb=spb;
		      mm.tg=tg;
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred while reading file.");
		      e.printStackTrace();
		    }

	}
    

    public static void writefile()
	{
        MedicalMapper m1= new MedicalMapper();
       double bmi=m1.mapBMI();
       int mapBloodpressure=m1.mapBloodPressure();
       double mapfbs= m1.mapFBS(fbs);
       int mapChol=m1.mapChol(chol);
       int mapHDL=m1.mapHDL(hdl);
       double mapLDL=m1.mapLDL((int)ldl);
       double getTG=m1.getTG((int)tg);
       double mapHB1AC=m1.mapHB1AC((int)hba1c);
       char mapGender=m1.ConvertGender(Gender);
		try {
            FileWriter myWriter = new FileWriter("ConvertedMedicalRecords.txt");
            myWriter.append(Integer.toString(PatientID) + "\t");
            myWriter.append(Integer.toString(Age)+ "\t");
            myWriter.append(mapGender+ "\t");
            myWriter.append(Integer.toString((int)bmi)+ "\t");
            myWriter.append(Integer.toString(mapBloodpressure)+ "\t");
            myWriter.append(Integer.toString((int)mapfbs)+ "\t");
            myWriter.append(Integer.toString(mapChol)+ "\t");
            myWriter.append(Integer.toString(mapHDL)+ "\t");
            myWriter.append(Integer.toString((int)mapLDL)+ "\t");
            myWriter.append(Integer.toString((int)getTG)+ "\t");
            myWriter.append(Integer.toString((int)mapHB1AC)+ "\t");
            myWriter.append(Integer.toString(m1.getTotal()));

		    myWriter.close();
		    System.out.println("File Successfully Updated !");
		    } 
		catch (IOException e) 
		{
		      System.out.println("An error occurred while file Updating.");
		      e.printStackTrace();
		    }
    
}
       

  
}
    

