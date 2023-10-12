//Function takes screenshot of web elements only.
    public static void takeScreenshot(WebElement element,String fileName){

        try {
            // Create a URL object from the image URL
            URL url = new URL(element.getAttribute("src"));

            // Read the image from the URL
            BufferedImage image = ImageIO.read(url);

            // Save the image as a file (change the path)
            File imageFile = new File("--path where you want to save the file---"+fileName+".png");
            ImageIO.write(image, "png", imageFile);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
