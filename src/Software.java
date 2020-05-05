public final class Software extends Product {
    private String programmer;
    private String platform; // linux, mac, or pc
    private String os;

    public void setOs(String os){
        this.os = os;
    }
    public String getOs(){
        return os;
    }

    public void setProgrammer(String programmer){
        this.programmer = programmer;
    }
    public String getProgrammer(){
        return programmer;
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
        if(!this.getProgrammer().equals(((Software)obj).getProgrammer())){
            return false;
        }
        if(!this.getDescription().equals(((Product)obj).getDescription())){
            return false;
        }
        return true;
    }   // end of overridden equals() method
}
