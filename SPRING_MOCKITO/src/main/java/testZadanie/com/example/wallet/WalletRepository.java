package testZadanie.com.example.wallet;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.*;

public interface WalletRepository extends JpaRepository<Wallet, UUID> {
}
