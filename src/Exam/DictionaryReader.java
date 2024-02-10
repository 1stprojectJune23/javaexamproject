package Exam;

		import java.io.BufferedReader;
		import java.io.FileReader;
		import java.io.IOException;

		public class DictionaryReader {

		    public static void main(String[] args) {
		        try { String filePath = "C:\\Users\\zewdi\\javaproject\\src\\Exam\\dictionary.txt"; // Path to the dictionary file

		            if (fileExists(filePath)) {
		                readDictionary(filePath);
		            } else {
		                System.out.println("File does not exist at the specified path.");
		            }
		        } catch (IOException e) {
		            System.out.println("An error occurred while reading the file: " + e.getMessage());
		        }
		    }

		    // Method to check if file exists at a given path
		    public static boolean fileExists(String filePath) {
		        try {
		            FileReader fileReader = new FileReader(filePath);
		            fileReader.close();
		            return true;
		        } catch (IOException e) {
		            return false;
		        }
		    }

		    // Method to read and print contents of the dictionary file
		    public static void readDictionary(String filePath) throws IOException {
		        BufferedReader reader = new BufferedReader(new FileReader(filePath));
		        String line;
		        while ((line = reader.readLine()) != null) {
		            String[] parts = line.split("—");
		            String word = parts[0].trim();
		            String meanings = parts[1].trim();
		            String[] meaningsArray = meanings.split(",");
		            System.out.println(word);
		            for (String meaning : meaningsArray) {
		                System.out.println(meaning.trim());
		            }
		        }
		        reader.close();
		    }
		

	}


