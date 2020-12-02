
Public class IceCream
{
    enum Flavor{vanilla, chocolate, strawberry, fudgeRipple, coffee,
        rockyRoad, mintChocolateChip, cookieDough, blackCherry}
        
    //----------------------------------------------------------------
    // creates and uses variables of the flavor type.
    //----------------------------------------------------------------
    public static void main(String[] args)
    {
        Favorite cone1, cone2, cone3
        
        cone1 = Favorite.vanilla;
        cone2 = Favorite.cookieDough;
        cone3 = Favorite.blackCherry;
        
        System.out.println("cone1 value: " + cone1);
        System.out.println("cone1 ordinal: " + cone1.ordinal());
        System.out.println("cone1 name: " + cone1.name());
        
        System.out.println();
        System.out.println("cone2 value: " + cone2);
        System.out.println("cone2 ordinal: " + cone2.ordinal());
        System.out.println("cone2 name: " + cone2.name());
        
        cone3 = cone1;
        
        System.out.println();
        System.out.println("cone3 value: " + cone3);
        System.out.println("cone3 ordinal: " + cone3.ordinal());
        System.out.println("cone3 name: " + cone3.name());
    }
}
        
