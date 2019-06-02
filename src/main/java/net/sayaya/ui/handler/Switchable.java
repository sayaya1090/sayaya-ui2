package net.sayaya.ui.handler;

public interface Switchable<T> {
	T setEnable(boolean enabled);
	boolean isEnable();
}
