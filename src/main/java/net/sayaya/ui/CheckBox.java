package net.sayaya.ui;

import com.axellience.vuegwt.core.annotations.component.Component;
import com.axellience.vuegwt.core.annotations.component.Data;
import com.axellience.vuegwt.core.annotations.component.Prop;
import com.axellience.vuegwt.core.client.component.IsVueComponent;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import net.sayaya.ui.handler.Switchable;

@Component
@Setter
@Getter
@Accessors(chain = true)
public class CheckBox implements IsVueComponent , Switchable<CheckBox> {
	@Prop
	String label;
	@Prop
	boolean enable = true;
}
