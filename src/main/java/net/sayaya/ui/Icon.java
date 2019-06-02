package net.sayaya.ui;

import com.axellience.vuegwt.core.annotations.component.*;
import com.axellience.vuegwt.core.client.component.IsVueComponent;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Component
@Setter
@Getter
@Accessors(chain = true)
public class Icon implements IsVueComponent {
	@Prop
	String icon;
	@Prop
	String weight;

	@Computed
	public Style getStyle() {
		return Resource.INSTANCE.style();
	}

	static {
		Resource.INSTANCE.style().ensureInjected();
	}
	interface Style extends CssResource {
		String icon();
	}
	public interface Resource extends ClientBundle {
		Resource INSTANCE = GWT.create(Resource.class);

		@Source("Icon.gss")
		Style style();
	}
}
