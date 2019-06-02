package net.sayaya.ui;

import com.axellience.vuegwt.core.annotations.component.Component;
import com.axellience.vuegwt.core.annotations.component.Computed;
import com.axellience.vuegwt.core.annotations.component.Data;
import com.axellience.vuegwt.core.annotations.component.Prop;
import com.axellience.vuegwt.core.client.component.IsVueComponent;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import net.sayaya.ui.handler.Switchable;

@Component(components = {Icon.class})
@Setter
@Getter
@Accessors(chain = true)
public class Button implements IsVueComponent, Switchable<Button> {
	public enum Type {
		FLAT, RAISED, TOGGLE
	}
	@Prop
	Type type;
	@Prop
	String label;
	@Prop
	String iconLeft;
	@Prop
	String iconRight;
	@Prop
	String weight;
	@Prop
	boolean enable = true;

	@Computed
	public String getStyle() {
		switch(type) {
			case FLAT:      return "btn-flat waves-effect waves-light";
			case RAISED:
			case TOGGLE:
			default:        return "btn waves-effect waves-light";
		}
	}
}
