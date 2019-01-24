package assignmentn1;


import java.io.File;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;


public class FileSearcher {
    public static void main(String args[])
    {
        FileSearcher searcher = new FileSearcher();
        searcher.repeatedSearch();
    }

    void repeatedSearch()
    {
        Scanner sc = new Scanner(System.in);

        //for repeatedly taking input from user, using infinite loop
        while(true)
        {
            System.out.println("Enter the regex to match files");
            String inputRegex = sc.next();

            //sending the input regular expression and the home directory path to be searched
            find(inputRegex,new File("/home"));
        }
    }


    void find(String regex,File directory)
    {
        //getting the list of file in that directory in to an array
        File[] availableFiles = directory.listFiles();

        //if directory is not empty,starts checking
        if(availableFiles!=null)
        {

            //for every file in directory
            for (File file:availableFiles)
            {
                //if the file in the directory is also a directory file, search in that directory also
                if(file.isDirectory())
                {
                    find(regex,file);
                }

                //if the file name is matched with regular expression,print the path to the file
                //matches method checks the pattern and the file name
                else if(matches(regex,file.getName()))
                {
                    System.out.println(file.getPath());
                }
            }
        }
    }



    //This method checks if filename matches with given pattern or not
    boolean matches(String regex,String name)
    {
        try{
            Pattern pattern = Pattern.compile(regex);
            Matcher m = pattern.matcher(name);
            if(m.find())
                return true;
        }
        catch(PatternSyntaxException e){
            System.out.println("Invalid pattern");
            repeatedSearch();
        }
        return false;
    }
}

/*
Test cases:

1)Enter the regex to match files
^javac
/home/zadmin/Downloads/idea-IC-183.4886.37/plugins/cvsIntegration/lib/javacvs-src.jar
/home/zadmin/Downloads/idea-IC-183.4886.37/lib/javac2.jar

2)Enter the regex to match files
.*\.md$
/home/zadmin/Downloads/idea-IC-183.4886.37/plugins/Kotlin/kotlinc/license/README.md
/home/zadmin/Downloads/My-home-page-master/README.md
/home/zadmin/zemosotraining/README.md
/home/zadmin/Desktop/zemosotraining/README.md
/home/zadmin/.local/share/Trash/files/zemosotraining.2/README.md
/home/zadmin/.local/share/Trash/files/zemosotraining/README.md
/home/zadmin/.local/share/Trash/files/zemosotraining/zemosotraining/README.md
/home/zadmin/.local/share/Trash/files/zemosotraining.3/README.md
/home/zadmin/.local/share/Trash/files/zemosotraining.4/README.md
/home/zadmin/.atom/packages/README.md
/home/zadmin/IdeaProjects/zemosotraining/README.md
/home/zadmin/IdeaProjects/java-assignments/README.md

3)Enter the regex to match files
java[1
Invalid pattern

4)Enter the regex to match files
^[2].*[.png]$
/home/zadmin/Downloads/My-home-page-master/images/2.jpg
/home/zadmin/.IdeaIC2018.3/system/vcs-users/296c3a6d.2.len
/home/zadmin/.IdeaIC2018.3/system/vcs-users/258eacf2.2.len
/home/zadmin/.cache/gnome-software/3.20/snap-icons/253b8af794a77befde1824326c085a9e73e3cc9e-product_256.png
/home/zadmin/.cache/gnome-software/3.20/snap-icons/2b49c63f3a7099f89840c68dcdbe0db3096218b9-splash_256x256.png
/home/zadmin/.cache/gnome-software/3.20/snap-icons/20c7d28ba9350deee56121cedb3b91da488d99cc-firefox256.png
/home/zadmin/.cache/gnome-software/3.20/snap-icons/23221e9f3f2966856de7f0800a59c7fc7c4526e7-icon256.png
/home/zadmin/.cache/gnome-software/3.20/snap-icons/2f2395b4d8a2b57671ee66e584ae1a0172426669-1.png
/home/zadmin/.cache/mozilla/firefox/qa0x88ti.default/thumbnails/2df67f3792458adbb79bd7e482b4a08b.png
/home/zadmin/.cache/thumbnails/large/2547e1b3b3d1f8b02905ce47b87e08ae.png
/home/zadmin/.cache/thumbnails/large/28efee27a60b051585ec936686771271.png
/home/zadmin/.cache/thumbnails/large/20c07590dd695fd3ac7e65259808c831.png

5)Enter the regex to match files
^(commit).*(sample)$
/home/zadmin/Downloads/zemoso-training/.git/hooks/commit-msg.sample
/home/zadmin/zemosotraining/.git/hooks/commit-msg.sample
/home/zadmin/Desktop/zemosotraining/.git/hooks/commit-msg.sample
/home/zadmin/.local/share/Trash/files/zemosotraining.2/.git/hooks/commit-msg.sample
/home/zadmin/.local/share/Trash/files/zemosotraining/zemosotraining/.git/hooks/commit-msg.sample
/home/zadmin/.local/share/Trash/files/zemosotraining/.git/hooks/commit-msg.sample
/home/zadmin/.local/share/Trash/files/zemosotraining.3/.git/hooks/commit-msg.sample
/home/zadmin/.local/share/Trash/files/MyTet/.git/hooks/commit-msg.sample
/home/zadmin/.local/share/Trash/files/first_git_repo/.git/hooks/commit-msg.sample
/home/zadmin/.local/share/Trash/files/zemosotraining.4/.git/hooks/commit-msg.sample
/home/zadmin/.local/share/Trash/files/zemoso-training/.git/hooks/commit-msg.sample
/home/zadmin/first_git_repo/.git/hooks/commit-msg.sample
/home/zadmin/IdeaProjects/zemosotraining/.git/hooks/commit-msg.sample
/home/zadmin/IdeaProjects/java-assignments/.git/hooks/commit-msg.sample
/home/zadmin/IdeaProjects/zemoso-training/.git/hooks/commit-msg.sample
/home/zadmin/kp1181.github.io/.git/hooks/commit-msg.sample

 */