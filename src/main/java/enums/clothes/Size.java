package enums.clothes;

public enum Size {
    XXS(32){
        @Override
        public String getDescription(){
            return "Kid core";
        }
    },
    XS(34),
    S(36),
    M(38),
    L(40);
    private final int euroSize;
    Size(int euroSize){
        this.euroSize=euroSize;
    }

    public String getDescription(){
        return "Adult size";
    }

}
