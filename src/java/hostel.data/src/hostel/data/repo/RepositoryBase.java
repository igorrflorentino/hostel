package hostel.data.repo;

public abstract class RepositoryBase <T> {

	//criar um atributo de conexao ao banco de dados
	
	public int create(T ent) {
		return 0;
	}
	
	public int read(T ent) {
		return 0;
	}
	
	public int update(T ent) {
		return 0;
	}
	
	public int delete(T ent) {
		return 0;
	}
	
}
