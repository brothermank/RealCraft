package com.example.alone;

public class Reference {
    public static final String MOD_ID = "alone";
    public static final String NAME = "Alogically Natural Entities";
    public static final String VERSION = "0.0";
    public static final String ACCEPTED_VERSIONS = "[1.10.2]";

    public static final String CLIENT_PROXY_CLASS = "com.example.alone.proxy.ClientProxy";
    public static final String SERVER_PROXY_CLASS = "com.example.alone.proxy.ServerProxy";

    public enum aloneItems{
        CANNABIS("itemcannabis", "itemcannabis"),
        CRACKER("itemcracker", "itemcracker");

        private String unlocalizedName;
        private String registryName;

        aloneItems(String unlocalizedName, String registryName){
            this.unlocalizedName = unlocalizedName;
            this.registryName = registryName;
        }

        public String getRegistryName() {
            return registryName;
        }

        public String getUnlocalizedName() {
            return unlocalizedName;
        }
    }

}
