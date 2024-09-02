# Java File Handling Example

This project demonstrates basic file handling operations in Java using the `java.io.File` class.

## Features

- Create a new file
- Check if a file already exists
- Display file name and absolute path
- Error handling for file operations

## Usage

The `Main` class contains the `main` method which demonstrates the file handling functionality:

1. It attempts to create a new file named "test.txt" on the desktop.
2. If the file is successfully created, it prints a success message along with the file name and absolute path.
3. If the file already exists, it prints a message indicating this, along with the file's absolute path.
4. Any exceptions during the file operation are caught and their stack traces are printed.

## Code Snippet

```java
File file = new File("C:\\Users\\MUMIN\\Desktop\\test.txt");

if (file.createNewFile()) {
    System.out.println("File created: " + file.getName());
    System.out.println(file.getAbsolutePath());
} else if (file.exists()) {
    System.out.println("File already exists.");
    System.out.println(file.getAbsolutePath());
}
