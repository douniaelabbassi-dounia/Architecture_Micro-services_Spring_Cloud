package org.sid.billingservice.repository;
import org.sid.billingservice.entities.Bill;
import org.sid.billingservice.entities.ProductItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.Collection;

@RepositoryRestResource
public interface BillRepository extends JpaRepository<Bill,Long> {
    //public Collection<ProductItem> findByBillId(Long id);
}
