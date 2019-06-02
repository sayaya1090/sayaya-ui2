package net.sayaya.ui.style;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public final class Palette {
	private final static Palette instance = new Palette();

	// Primary Color
	private String color1;
	// Accent Color
	private String color2;
	private String colorText1 = "rgba(0, 0, 0, 0.87)";
	private String colorText2 = "rgba(0, 0, 0, 0.54)";
	private String colorText3 = "rgba(0, 0, 0, 0.38)";
	private String colorDivider = "rgba(0, 0, 0, 0.12)";
	private String colorSafe = Color.Emerald;
	private String colorWarn = Color.Mimosa;
	private String colorError = Color.Crimson;
	
	public static Palette getInstance() {
		return instance;
	}
	private Palette(){}
	/**
	 * A primary color is the color displayed most frequently across your apps screens and components. If you don��t have a secondary color, your primary color can also be used to accent elements.
	 * <p><b>Dark and light primary variants</b></p>
	 * You can make a color theme for your app using your primary color, as well as dark and light primary variants.<br/>
     * <p><b>Distinguish UI elements</b></p>
     * To create contrast between UI elements, such as distinguishing a top app bar from a system bar, you can use light or dark variants of your primary color on each elements. You can also use variants to distinguish elements within a component, such different variants used on a floating action button container, and the icon within it.
     */
	public String getColor1() {
		return color1;
	}
	/**
	 * A primary color is the color displayed most frequently across your apps screens and components. If you don��t have a secondary color, your primary color can also be used to accent elements.
	 * <p><b>Dark and light primary variants</b></p>
	 * You can make a color theme for your app using your primary color, as well as dark and light primary variants.<br/>
     * <p><b>Distinguish UI elements</b></p>
     * To create contrast between UI elements, such as distinguishing a top app bar from a system bar, you can use light or dark variants of your primary color on each elements. You can also use variants to distinguish elements within a component, such different variants used on a floating action button container, and the icon within it.
     */
	public Palette setColor1(String color1) {
		this.color1 = color1;
		return this;
	}
	/**
	 * A secondary color provides more ways to accent and distinguish your product. Having a secondary color is optional, and should be applied sparingly to accent select parts of your UI.
	 * <p>Secondary colors are best for:</p>
	 * <li>Floating action buttons</li>
	 * <li>Selection controls, like sliders and switches</li>
	 * <li>Highlighting selected text</li>
	 * <li>Progress bars</li>
	 * <li>Links and headlines</li>
	 * <li>Dark and light secondary variants</li>
     * Just like the primary color, your secondary color can have dark and light variants. You can make a color theme by using your primary color, secondary color, and dark and light variants of each color.
     */
	public String getColor2() {
		return color2;
	}
	/**
	 * A secondary color provides more ways to accent and distinguish your product. Having a secondary color is optional, and should be applied sparingly to accent select parts of your UI.
	 * <p>Secondary colors are best for:</p>
	 * <li>Floating action buttons</li>
	 * <li>Selection controls, like sliders and switches</li>
	 * <li>Highlighting selected text</li>
	 * <li>Progress bars</li>
	 * <li>Links and headlines</li>
	 * <li>Dark and light secondary variants</li>
     * Just like the primary color, your secondary color can have dark and light variants. You can make a color theme by using your primary color, secondary color, and dark and light variants of each color.
     */
	public Palette setColor2(String color2) {
		this.color2 = color2;
		return this;
	}
}
