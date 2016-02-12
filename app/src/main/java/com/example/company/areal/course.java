package com.example.company.areal;

/**
 * Created by Lenovo on 04/02/2016.
 */
//yield of rails
public class course {
    private int CourseNo;
    private double credithours;
    private String Title;
    private String content;
//            = "No i didn't mean it that way.I am not looking for real life impleme" +
//            "mntatiooperations implemented in real life applications.Fo";
//             StringBuffer buffer = new StringBuffer();
//kl krna hy

//    public StringBuffer getBuffer() {
//        buffer.append(content);
//        buffer.append(content);
//        buffer.append(content);
//
//        return buffer;
//    }


    public int getCourseNo() {
        return CourseNo;
    }

    public String getContent() {
        return content;
    }


    public double getCredithours() {
        return credithours;
    }

    public String getTitle() {
        return Title;
    }

    @Override
    public String toString() {
        return Title;
    }

    public course(int CourseNo, String Title, String content, double credithours) {
        this.CourseNo= CourseNo;
        this.Title= Title;
        this.content= content;
        this.credithours=credithours;


    }


}