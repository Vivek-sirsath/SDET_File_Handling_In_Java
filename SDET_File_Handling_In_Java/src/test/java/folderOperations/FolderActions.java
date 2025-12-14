package folderOperations;

import java.io.File;

public class FolderActions {

	// Create a folder
	public static void createFolder(String folderpath) {

		File folder = new File(folderpath);
		if (!folder.exists()) {

			folder.mkdir();
			System.out.println("Folder created... " + folderpath);
		}
	}

	// Check the folder existance
	public static boolean checkFolderExists(String folderpath) {

		File folder = new File(folderpath);
//		if (folder.exists()) {
//			System.out.println("Folder Exists... " + folderpath);
//		}
		return folder.exists();
	}

	// Rename the folder
	public static void renameFolder(String oldPath, String newPath) {

		File oldFolder = new File(oldPath);
		File newFolder = new File(newPath);

		if (oldFolder.exists()) {
			oldFolder.renameTo(newFolder);
			System.out.println("Folder renamed to... : " + newPath);
		}

	}
	
	// Delete the folder
	public static void deleteFolder(String folderPath) {

		File folder = new File(folderPath);

		if (folder.exists()) {
			// Before deleting folder, delete all the files from the felder
			for(File file : folder.listFiles()) {
				file.delete();
			}
			folder.delete();
			System.out.println("Folder deleted... : " + folderPath);
		}

	}

	public static void main(String[] args) {

//		String folderpath = System.getProperty("user.dir") + "\\folderOperations\\myfolder";
		String folderpath = "C:\\Users\\admin\\Desktop\\myFolder";

		// Creating folder
		createFolder(folderpath);

		// Checking existance of folder
		boolean status = checkFolderExists(folderpath);
		System.out.println("Is Folder Exists: " + status);

		// Renaming the existing folder - 'myFolder' to 'renamedFolder'
		String newFolderPath = "C:\\Users\\admin\\Desktop\\renamedFolder";
		renameFolder(folderpath, newFolderPath);
		
		// Deleting the folder
		deleteFolder(newFolderPath);

	}

}
