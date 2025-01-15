public class Patient{
    static int PatientID;
    int Age;
     static double Height;
     int Gender;
     static double Weight;
       



    public static double getBMI(){ 
    	double mHeight=Height * 0.01;
        double BMI = Weight/(mHeight*mHeight);
            return BMI;
    
    
    
    }
        
        

    }


