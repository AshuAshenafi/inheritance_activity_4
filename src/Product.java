public abstract class Product {
    private String code;
    private String description;
    private double price;
    protected static int count = 0; // a protected static variable

    public Product() {
        code = "";
        description = "";
        price = 0;
        count++;
    }

    // Get and set accessors for the code, description, and price instance variables

    @Override
    public String toString() {
        return "Code:               " + code + "\n" +
                "Description:        " + description + "\n" +
                "Price:              " + this.getFormattedPrice(price) + "\n";
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
        if(!this.code.equals(((Product)obj).code)){
            return false;
        }
        if(!this.description.equals(((Product)obj).description)){
            return false;
        }
        return true;
    }

    private String getFormattedPrice(double price) {
        // Use the NumberFormat class to format the price to 2 decimal places
        return String.format("$%(,.2f" , price);
    }

    // Create public access for the count variable
    public static int getCount() {
        return count;
    }
    public void setCode(String code){
        this.code = code;
    }
    public void setPrice(double prc){
        this.price = prc;
    }
    public void setDescription(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
