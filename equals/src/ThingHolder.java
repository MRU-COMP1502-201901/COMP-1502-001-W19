
public class ThingHolder {

	private Thing thing;
	
	public ThingHolder(Thing t) {
		this.thing = new Thing(t);
	}

	public Thing getThing() {
		return new Thing(thing);
	}

	public void setThing(Thing thing) {
		this.thing = thing;
	}
	
	public String toString() {
		return "My Thing is: " + thing.toString();
	}
	
}
