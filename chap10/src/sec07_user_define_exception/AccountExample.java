package sec07_user_define_exception;

public class AccountExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account();

		account.deposit(10000);
		;
		System.out.println("���ݾ�: " + account.getBalance());

//����ϱ�
		try {
			account.withdraw(30000);
		} catch (BalanceInsufficientException e) {
			String message = e.getMessage(); // ���ܰ�ü�� �޼����� ��ȯ�Ѵ�.
			System.out.println(message);
			System.out.println();
			e.printStackTrace();// ���ܰ�ü�� ���� �ڼ��� ������ ������ش�.
		}
	}

}
