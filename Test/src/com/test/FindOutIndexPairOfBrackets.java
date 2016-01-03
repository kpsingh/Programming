package com.test;

public class FindOutIndexPairOfBrackets {
	public static void main(String[] args)
	{
		String s = "{(dh}[id]){g}P";
		findOutIndex(s);
	}

	public static void findOutIndex(String s)
	{
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < s.length(); i++)
		{
			char c = s.charAt(i);

			if (c == '{' || c == '[' || c == '(')
			{
				sb = sb.append("" + c + i);

				for (int j = i + 1; j < s.length(); j++)
				{
					char temp = s.charAt(j);

					if (c == '{')
					{
						if (temp == '}')
						{
							sb.append("" + temp + j);
							System.out.println(sb.toString());
							sb = new StringBuilder();
							break;
						}

					}
					else if (c == '(')
					{
						if (temp == ')')
						{
							sb.append("" + temp + j);
							System.out.println(sb.toString());
							sb = new StringBuilder();
							break;
						}

					}
					else if (c == '[')
					{
						if (temp == ']')
						{
							sb.append("" + temp + j);
							System.out.println(sb.toString());
							sb = new StringBuilder();
							break;
						}

					}
				}
			}

		}

	}

}
