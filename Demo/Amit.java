class Ltbp
{
int a=0;
static int b=10;
void m1 (int a; intb)
	{
	System.out.pritln(a);
	System.out.println(b);
	System.out.println(Ltbp.b);
	System.out.println(this.a);
static void m2(int a)
		{
	Ltbp t=new Ltbp();
	System.out.println(a);
	System.out.println(t.a);
	public static void main(string[] args)
			{
		Ltbp t=new ltbp();
		t.m1(20,30);
		Ltbp.m2(40);
		System.out.println(t.a);
		System.out.println(Ltbp.b);
			}
		}