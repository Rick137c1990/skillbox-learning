# Multithreaded Image Resizer

This is a simple Java project that demonstrates how to resize images using multiple threads.  
The program scans a source directory, resizes each image to a fixed width while preserving the aspect ratio, and saves the processed images into a destination directory.  

It uses the [`imgscalr`](https://github.com/rkalla/imgscalr) library for efficient, high-quality image resizing.

---

## Features

- Resizes all images in a given folder.
- Maintains aspect ratio while scaling images to a fixed width of **300px**.
- Saves resized images as `.jpg` files to a destination folder.
- Utilizes **multithreading** by splitting the workload across available CPU cores for better performance.

---

## Project Structure

ImageResizer/  
├── Files/  
│    ├── picture/ # Source folder with original images  
│    └── thumbnail_picture/ # Destination folder for resized images  
├── Main.java # Entry point of the program  
└── ImageProcessor.java # Worker class for resizing images  

---

## Requirements

- **Java 8 or later**
- **Maven/Gradle** (if you want to manage dependencies)
- `imgscalr` library:
  ```xml
  <dependency>
      <groupId>org.imgscalr</groupId>
      <artifactId>imgscalr-lib</artifactId>
      <version>4.2</version>
  </dependency>
How to Run
Clone or download the project.
Place your source images into:
ImageResizer/Files/picture/
Compile and run the program:
javac -cp .:imgscalr-lib-4.2.jar Main.java ImageProcessor.java
java -cp .:imgscalr-lib-4.2.jar Main
(Adjust classpath separators depending on your OS: : for macOS/Linux, ; for Windows.)
Processed images will appear in:
ImageResizer/Files/thumbnail_picture/
Example Output
Duration: 152 ms
The duration will vary depending on the number of images and your CPU performance.
Notes
Images are always resized to a width of 300px while keeping the height proportional.
Non-image files in the source folder are skipped.
Ensure the destination folder exists before running the program.
