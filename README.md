# Patient Records Management System
1. **Patient Class**
   - Variables: Patient ID, weight, height, gender.
   - Static Method: `getBMI()` calculates the BMI using weight and height.

2. **Laboratory Class**
   - Implements inheritance, with `Patient` as the superclass.
   - Variables include medical metrics like SBP, DBP, FBS, cholesterol, HDL, LDL, TG, and HbA1c.

3. **Medical Mapper Class**
   - Combines inheritance and abstraction.
   - Implements the `Mapping` interface and overrides the `compareTo` method to compare and sort data.
   - Methods for mapping metrics like BMI, blood pressure, and converting gender.

4. **Test Class**
   - Contains the `main` method, serving as the entry point of the program.
   - Reads and writes data to text files using `File`, `Scanner`, and `FileWriter` classes.

### Key Features
- **BMI Calculation:** Based on user-input weight and height.
- **Inheritance:** Enabled reuse of attributes and methods between classes.
- **Abstraction:** Hides unnecessary implementation details from users.
- **File Operations:** Handles reading from and writing to files for storing patient records.
- **Error Handling:** Ensures robust execution using `try-catch` blocks.

### File Details
- **MedicalRecord.txt:** Stores raw patient data.
- **ConvertedMedicalRecords.txt:** Contains processed and converted values.

### Example Code Snippets
- **BMI Mapping:**
  ```java
  if (bmi <= 0 || bmi >= 17.9) return 0;
  else if (bmi >= 18 && bmi <= 24.9) return 1;
  else if (bmi >= 25 && bmi <= 29.9) return 2;
  else return 3;
  ```

- **Gender Conversion:**
  ```java
  if (gender == 2) return 'F';
  else return 'M';
  ```

## Conclusion
Through this project, the patient data management system was successfully implemented, overcoming numerous errors. The system efficiently writes user data to one file (`MedicalRecord.txt`) and converts the values for another file (`ConvertedMedicalRecords.txt`). The techniques learned during this project will be invaluable for future endeavors.
