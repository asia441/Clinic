//package com.example.Clinic.DAO;
////
////import com.example.Clinic.connection.HibernateUtil;
//import com.example.Clinic.model.Doctor;
//import org.apache.log4j.Logger;
//import org.hibernate.HibernateException;
//import org.hibernate.Session;
//import org.hibernate.Transaction;

//public class DoctorDao {
//
//
//    private final Logger logger = Logger.getLogger(DoctorDao.class);
//
//    public void save(Doctor doctor) {
//        Transaction transaction = null;
//
//        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
//            transaction = session.beginTransaction();
//            session.save(doctor);
//            transaction.commit();
//        } catch (HibernateException e) {
//            if (transaction != null)
//                transaction.rollback();
//
//            logger.error(e.getMessage(), e);
//        }
//    }
//}
