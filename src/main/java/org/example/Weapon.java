package org.example;

public enum Weapon {
    //Burada Enum değişkenini bir nesne oluştururkenki constructorını çalıştırır gibi
    //çalıştırıyoruz, bu sayede SWORD ve AXE enumlarının damage ve attackSpeedleri belli oluyor
    SWORD(5,4),
    AXE(10,2);

    //Burada fieldlar yazılıyor
    private int damage;
    private double attackSpeed;


    //Burada constructor tanımlanıyor ve aynı normal bir sınıftaki gibi
    //Enum için kullanılıyor
    Weapon(int damage, double attackSpeed)
    {
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }

    //Burada da fieldlar için getter yazılıyor.
    public int getDamage()
    {
       return this.damage;
    }

    public double getAttackSpeed()
    {
        return this.attackSpeed;
    }

}



