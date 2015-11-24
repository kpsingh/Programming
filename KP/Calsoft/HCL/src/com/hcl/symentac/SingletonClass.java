package com.hcl.symentac;

public class SingletonClass {

	private static SingletonClass INSTANCE = null;

	private SingletonClass() {

	}


	/**
	 * This method is implementation of thread safe Singleton.
	 * 
	 * @return instance of the SingletonClass class.
	 */

	public static SingletonClass getInstance()
	{
		if (INSTANCE == null)
		{
			synchronized (SingletonClass.class)
			{
				if (INSTANCE == null)
				{
					INSTANCE = new SingletonClass();
				}
				else
				{
					return INSTANCE;
				}

			}
		}
		return INSTANCE;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException
	{
		throw new CloneNotSupportedException("Cloning is not allowed.");
	}
}

/**
 *  A singelton CLASS CAN'T BE INSTANTIATED.
 */
