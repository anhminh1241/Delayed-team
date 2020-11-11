/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ThanhNam
 */
public class Problem {
    private String problemId;
    private String date;
    private String name ;
    private String shortDesc;
    private String linkfullDes;
    private double Marks;
    private String Category ;
    private String Author;

    public Problem() {
    }

    public Problem(String problemId,String date, String name, String shortDesc, String linkfullDes, double Marks, String Category, String Author) {
        this.problemId = problemId;
        this.date = date;
        this.name = name;
        this.shortDesc = shortDesc;
        this.linkfullDes = linkfullDes;
        this.Marks = Marks;
        this.Category = Category;
        this.Author = Author;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    

    public String getProblemId() {
        return problemId;
    }

    public void setProblemId(String problemId) {
        this.problemId = problemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortDesc() {
        return shortDesc;
    }

    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }

    public String getLinkfullDes() {
        return linkfullDes;
    }

    public void setLinkfullDes(String linkfullDes) {
        this.linkfullDes = linkfullDes;
    }

    public double getMarks() {
        return Marks;
    }

    public void setMarks(double Marks) {
        this.Marks = Marks;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    @Override
    public String toString() {
        return    problemId + " | " + date + " | " + name + " | " + shortDesc + " | " + linkfullDes +  " | " + Marks +  " | " + Category +  " | "+ Author +"\n" ;
    }
    
    

}