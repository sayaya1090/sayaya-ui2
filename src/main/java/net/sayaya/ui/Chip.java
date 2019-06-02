package net.sayaya.ui;

import com.axellience.vuegwt.core.annotations.component.Component;
import com.axellience.vuegwt.core.annotations.component.Computed;
import com.axellience.vuegwt.core.annotations.component.Data;
import com.axellience.vuegwt.core.annotations.component.Prop;
import com.axellience.vuegwt.core.client.component.IsVueComponent;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.Scheduler;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;
import elemental2.dom.Event;
import jsinterop.annotations.JsMethod;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import net.sayaya.ui.Icon;
import net.sayaya.ui.handler.Switchable;

@Component(components = {Icon.class})
@Setter
@Getter
@Accessors(chain = true)
public class Chip implements IsVueComponent, Switchable<Chip> {
	@Prop
	String label;
	@Prop
	String icon;
	@Prop
	String weight;
	@Prop
	boolean enable = true;
	@Prop
	boolean deletable = true;

	@JsMethod
	public void delete(Event t) {
		GWT.log("!");
		vue().$destroy();
	}

	@Computed
	public String getStyle() {
		return "chip " + Resource.INSTANCE.style().chip();
	}

	static {
		Resource.INSTANCE.style().ensureInjected();
	}
	interface Style extends CssResource {
		String chip();
	}
	public interface Resource extends ClientBundle {
		Resource INSTANCE = GWT.create(Resource.class);
		@Source("Chip.gss")
		Style style();
	}
}