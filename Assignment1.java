import java.io.File;
import java.io.IOException;

    public class Assignment1{
        public static void findfile(String path,String filename){
            //Creating a File object for directory
            File directoryPath = new File(path);
            //List of all files and directories
            //List of all files and directories
            File filesList[] = directoryPath.listFiles();
            if(filesList==null){
                return;
            }
            for(File file : filesList) {
                if(file.getName().equals(filename))
                System.out.println("File path: "+file.getAbsolutePath());

                if(file.isDirectory()){
                  /*  System.out.println(file.getAbsolutePath());*/

                    findfile(file.getPath(),filename);
                }
            }

            return;

        }

        public static void main(String args[]) throws IOException {
            String file="Assignment1.java";
            String path="/home/pranas/IdeaProjects";
            findfile(path,file);

        }
    }

