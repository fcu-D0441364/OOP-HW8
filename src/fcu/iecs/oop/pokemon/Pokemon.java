package fcu.iecs.oop.pokemon;

public class Pokemon implements Fightable {
	private String nickName;
	private final PokemonType type;
	private int cp;
	
	public Pokemon(String name,PokemonType type,int cp){
		this.nickName = name;
		this.type = type;
		this.cp = cp;
	}
	
	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	
	public int getCp() {
		return cp;
	}
	
	public void setCp(int cp) {
		this.cp = cp;
	}
	
	public PokemonType getType() {
		return type;
	}
	@Override
	public void attack() {
		// TODO Auto-generated method stub

	}

}
