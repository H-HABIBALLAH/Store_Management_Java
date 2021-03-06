package StoreManagement.DAO.Vente;

import StoreManagement.DAO.Client.Client;
import StoreManagement.DAO.IDao;

import java.util.List;

public interface IVenteDao{
        public void add(Vente vente);
        public void delete(long numero);
        public List getAll(Long codeClient);
        public void deleteAll(Client client);
        public void update(Vente vente);
        public Vente getOne(long numero);
        public Vente getOne(long numero,long codeClient);
    }
