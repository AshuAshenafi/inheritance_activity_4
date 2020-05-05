public final class Book extends Product {
    private String author;
    private int pages;

    // generate getters and setters

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public boolean equals(Object obj) {
        // any reference can be null and if you use a null reference you will
        // get a NullPointerException   -   not good! before you can use the parameter
        // passed to equals you must verify that it is not null and, if it is, return false.
        if(obj == null){
            return false;
        }
        // class types have to be identical
        if(this.getClass() != obj.getClass()){
            return false;
        }
        if(!this.author.equals(((Book)obj).getAuthor())){
            return false;
        }
        if(!this.getDescription().equals(((Product)obj).getDescription())){
            return false;
        }
        return true;
    }   // end of overridden equals() method
}
