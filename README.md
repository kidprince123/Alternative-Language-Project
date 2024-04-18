#Programming Documentation

##Programming Version
-Java, Version 11

## Why Java?
I chose Java for this project because it was a language I was perviously familair with. With my previous experience in an OOP class, we used Java so I believe it would be a good fit for this project.



#What Company (oem) has the highest average weight of the phone body?
![image](https://github.com/kidprince123/Alternative-Language-Project/assets/24783561/0a99b499-68fc-4b4e-ab50-298210f646c8)


#Phones that were announced in one year and released in another, OEM and models.

![image](https://github.com/kidprince123/Alternative-Language-Project/assets/24783561/018e3b5e-677f-4005-bfe6-4e925808cac2)
![image](https://github.com/kidprince123/Alternative-Language-Project/assets/24783561/559c6927-90bb-4aec-b11f-6507610c42f7)
![image](https://github.com/kidprince123/Alternative-Language-Project/assets/24783561/81472ad0-7138-4252-b365-5d29f95a2c89)
![image](https://github.com/kidprince123/Alternative-Language-Project/assets/24783561/d3594396-07a3-47a6-85b6-d5654c32c791)

#How many phones have only one feature sensor?
![image](https://github.com/kidprince123/Alternative-Language-Project/assets/24783561/31afabdc-a683-4b6f-b69c-033e8d686d99)

#What year had the most phones launched in any year later than 1999?
![image](https://github.com/kidprince123/Alternative-Language-Project/assets/24783561/57c9e859-5d09-408d-b5f8-6692cde4b1d4)

# How your programming language chosen handles: object-oriented programming, file ingestion, conditional statements, assignment statements, loops, subprograms (functions/methods), unit testing and exception handling.
*Object Oriented Programming is fully supported with Java being inherently object oriented designed, the 'Cell' class in the code demonstrates encapsulation with public methods and private attributes.
*File Ingestion is fully supported 'BufferedReader' and 'FileReader' for reading data from files and this is evident in 'readCSV' method.
*Conditional statements are fully presented for example validating data entries in the 'cleanData' method.
*Loops are fully supported in plenty of the methods.
*Exception handling is fully present and supported, it is managed with try-catch blocks, as shown as in the 'readCSV' method to handle potential 'IOExceptions'.

#Libraries used
Java.io(FileReader, BufferedReader): Purpose of this was for handling file reading operations and it used in the 'readCSV' method to read and process data from a CSV file.
Java.util(ArrayList, HashMap): Purpose of these libraries were to manage collections such as lists and maps, utilizing 'Hashmaps' for storing and managing 'Cell' objects, while 'ArrayList' is used for dynamic storage.
Apache Commons CSV (Suggested Library): Purpose of this was to simplify CSV file manipulations.
