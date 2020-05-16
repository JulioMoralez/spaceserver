package pack.model;

import javax.persistence.*;

@Entity
@Table(name = "t_game")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer credits;
    private Integer armor;
    private Integer fuel;
    private Integer rocket;
    private Integer system;
    private Integer planet;
    private String equip;
    private String inventory;
    private String goods;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    public Game() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCredits() {
        return credits;
    }

    public void setCredits(Integer credits) {
        this.credits = credits;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getArmor() {
        return armor;
    }

    public void setArmor(Integer armor) {
        this.armor = armor;
    }

    public Integer getFuel() {
        return fuel;
    }

    public void setFuel(Integer fuel) {
        this.fuel = fuel;
    }

    public Integer getRocket() {
        return rocket;
    }

    public void setRocket(Integer rocket) {
        this.rocket = rocket;
    }

    public Integer getSystem() {
        return system;
    }

    public void setSystem(Integer system) {
        this.system = system;
    }

    public Integer getPlanet() {
        return planet;
    }

    public void setPlanet(Integer planet) {
        this.planet = planet;
    }

    public String getInventory() {
        return inventory;
    }

    public void setInventory(String inventory) {
        this.inventory = inventory;
    }

    public String getGoods() {
        return goods;
    }

    public void setGoods(String goods) {
        this.goods = goods;
    }

    public String getEquip() {
        return equip;
    }

    public void setEquip(String equip) {
        this.equip = equip;
    }
}
