package com.sendpulse.restapi;

import java.util.Map;

/*
 * Interface for SendPulse REST API
 *
 * Documentation
 * https://login.sendpulse.com/manual/rest-api/
 * https://sendpulse.com/api
 *
 */
public interface SendpulseInterface {
   /**
     * Create new address book
     *
     * @param String bookName
     * @return Map<String, Object>
     */
    public Map<String, Object> createAddressBook(String bookName );

    /**
     * Edit address book name
     *
     * @param int id
     * @param String newName
     * @return Map<String, Object>
     */
    public Map<String, Object> editAddressBook( int id , String newname);

    /**
     * Remove address book
     *
     * @param int id
     * @return Map<String, Object>
     */
    public Map<String, Object> removeAddressBook( int id );

    /**
     * Get list of address books
     *
     * @param int limit
     * @param int offset
     * @return Map<String, Object>
     */
    public Map<String, Object> listAddressBooks( int limit, int offset);

    /**
     * Get book info
     *
     * @param int id
     * @return Map<String, Object>
     */
    public Map<String, Object> getBookInfo( int id );

    /**
     * Get list pf emails from book
     *
     * @param int id
     * @return Map<String, Object>
     */
    public Map<String, Object> getEmailsFromBook( int id );

    /**
     * Add new emails to book
     *
     * @param int bookId
     * @param String emails
     * @return Map<String, Object>
     */
    public Map<String, Object> addEmails( int bookId , String emails);

    /**
     * Remove emails from book
     *
     * @param int bookId
     * @param String emails
     * @return Map<String, Object>
     */
    public Map<String, Object> removeEmails( int bookId , String emails);

    /**
     * Get information about email from book
     *
     * @param int bookId
     * @param String email
     * @return Map<String, Object>
     */
    public Map<String, Object> getEmailInfo( int bookId, String email );

    /**
     * Calculate cost of the campaign based on address book
     *
     * @param int bookId
     * @return Map<String, Object>
     */
    public Map<String, Object> campaignCost( int bookId );

    /**
     * Get list of campaigns
     *
     * @param int limit
     * @param int offset
     * @return Map<String, Object>
     */
    public Map<String, Object> listCampaigns( int limit, int offset);

    /**
     * Get information about campaign
     *
     * @param int id
     * @return Map<String, Object>
     */
    public Map<String, Object> getCampaignInfo( int id );

    /**
     * Get campaign statistic by countries
     *
     * @param int id
     * @return Map<String, Object>
     */
    public Map<String, Object> campaignStatByCountries( int id );

    /**
     * Get campaign statistic by referrals
     *
     * @param int id
     * @return Map<String, Object>
     */
    public Map<String, Object> campaignStatByReferrals( int id );

    /**
     * Create new campaign
     *
     * @param String senderName
     * @param String senderEmail
     * @param String subject
     * @param String body
     * @param int bookId
     * @param String name
     * @param String attachments
     * @return Map<String, Object>
     */
    public Map<String, Object> createCampaign( String senderName, String senderEmail, String subject, String body, int bookId, String name, String attachments);

    /**
     * Cancel campaign
     *
     * @param int id
     * @return Map<String, Object>
     */
    public Map<String, Object> cancelCampaign( int id );

    /**
     * Get list of allowed senders
     * @return Map<String, Object>
     */
    public Map<String, Object> listSenders();

    /**
     * Add new sender
     *
     * @param String senderName
     * @param String senderEmail
     * @return Map<String, Object>
     */
    public Map<String, Object> addSender( String senderName,String senderEmail );

    /**
     * Remove sender
     *
     * @param String email
     * @return Map<String, Object>
     */
    public Map<String, Object> removeSender( String email );

    /**
     * Activate sender using code from mail
     *
     * @param String email
     * @param String code
     * @return Map<String, Object>
     */
    public Map<String, Object> activateSender( String email, String code );

    /**
     * Send mail with activation code on sender email
     *
     * @param String email
     * @return Map<String, Object>
     */
    public Map<String, Object> getSenderActivationMail( String email );

    /**
     * Get global information about email
     *
     * @param String email
     * @return Map<String, Object>
     */
    public Map<String, Object> getEmailGlobalInfo( String email );

    /**
     * Remove email address from all books
     *
     * @param String email
     * @return Map<String, Object>
     */
    public Map<String, Object> removeEmailFromAllBooks( String email );

    /**
     * Get statistic for email by all campaigns
     *
     * @param String email
     * @return Map<String, Object>
     */
    public Map<String, Object> emailStatByCampaigns( String email );

    /**
     * Show emails from blacklist
     * @return Map<String, Object>
     */
    public Map<String, Object> getBlackList();

    /**
     * Add email address to blacklist
     *
     * @param String emails
     * @return Map<String, Object>
     */
    public Map<String, Object> addToBlackList( String emails);

    /**
     * Remove email address from blacklist
     *
     * @param String emails
     * @return Map<String, Object>
     */
    public Map<String, Object> removeFromBlackList( String emails );

    /**
     * Return user balance
     *
     * @param String currency
     * @return Map<String, Object>
     */
    public Map<String, Object> getBalance( String currency);

    /**
     * Get list of emails that was sent by SMTP
     *
     * @param int limit
     * @param int offset
     * @param String fromDate
     * @param String toDate
     * @param String sender
     * @param String recipient
     * @return Map<String, Object>
     */
    public Map<String, Object> smtpListEmails( int limit, int offset, String fromDate, String toDate, String sender, String recipient);

    /**
     * Get information about email by his id
     *
     * @param String id
     * @return Map<String, Object>
     */
    public Map<String, Object> smtpGetEmailInfoById( String id );

    /**
     * Unsubscribe emails using SMTP
     *
     * @param String emails
     * @return Map<String, Object>
     */
    public Map<String, Object> smtpUnsubscribeEmails( String emails );

    /**
     * Remove emails from unsubscribe list using SMTP
     *
     * @param String emails
     * @return Map<String, Object>
     */
    public Map<String, Object> smtpRemoveFromUnsubscribe( String emails );

    /**
     * Get list of allowed IPs using SMTP
     * @return Map<String, Object>
     */
    public Map<String, Object> smtpListIP();

    /**
     * Get list of allowed domains using SMTP
     * @return Map<String, Object>
     */
    public Map<String, Object> smtpListAllowedDomains();

    /**
     * Add domain using SMTP
     *
     * @param String email
     * @return Map<String, Object>
     */
    public Map<String, Object> smtpAddDomain( String email );

    /**
     * Send confirm mail to verify new domain
     *
     * @param String email
     * @return Map<String, Object>
     */
    public Map<String, Object> smtpVerifyDomain( String email );

    /**
     * Send mail using SMTP
     *
     * @param String email
     * @return Map<String, Object>
     */
    public Map<String, Object> smtpSendMail( Map<String, Object> emaildata );
    
    /**
     * Get list of push campaigns
     * @param limit
     * @param offset
     * @return
     */
    public Map<String, Object> pushListCampaigns(int limit, int offset);
    
    /**
     * Get push campaigns info
     * @param id
     * @return
     */
    public Map<String, Object> pushCampaignInfo( int id );
    
    /**
     * Get amount of websites
     * @return
     */
    public Map<String, Object> pushCountWebsites();
    
    /**
     * Get list of websites
     * @param limit
     * @param offset
     * @return
     */
    public Map<String, Object> pushListWebsites(int limit, int offset);
    
    /**
     * Get list of all variables for website
     * @param id
     * @return
     */
    public Map<String, Object> pushListWebsiteVariables( int id);
    
    /**
     * Get list of subscriptions for the website
     * @param id
     * @param limit
     * @param offset
     * @return
     */
    public Map<String, Object> pushListWebsiteSubscriptions(int id,int limit, int offset);
    
    /**
     * Get amount of subscriptions for the site
     * @param id
     * @return
     */
    public Map<String, Object> pushCountWebsiteSubscriptions( int id);
    
    /**
     * Set state for subscription
     * @param id
     * @param state
     * @return
     */
    public Map<String, Object> pushSetSubscriptionState( int id, int state);
    
    /**
     * Create new push campaign
     * @param Map<String, Object> taskinfo
     * @param Map<String, Object> additionalParams
     * @return
     */
    public Map<String, Object> createPushTask( Map<String, Object> taskinfo, Map<String, Object> additionalParams);
}