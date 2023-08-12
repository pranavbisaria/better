package com.Better.Service;

import com.Better.Models.User;
import com.Better.Payloads.AddressDto;
import com.Better.Payloads.OtpDto;
import com.Better.Payloads.TwilioCacheDto;
import com.Better.Payloads.UserProfile;
import org.springframework.http.ResponseEntity;

public interface UserService {
    ResponseEntity<?> updateUserProfile(User user, UserProfile userProfile);

    ResponseEntity<?> verifyResetPhoneOTP(User user, TwilioCacheDto twilioCacheDto);

    ResponseEntity<?> sendEmailOTP(User user, String email) throws Exception;

    ResponseEntity<?> verifyResetEmailOTP(User user, OtpDto otpDto);

    ResponseEntity<?> getAllAddress(User user);

    ResponseEntity<?> addAddress(User user, AddressDto addressDto);

    ResponseEntity<?> updateAddress(User user, AddressDto addressDto, Long addressId);

    ResponseEntity<?> removeAddress(User user, Long addressId);
}
