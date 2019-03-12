#import <Cordova/CDV.h>

#import "ZBarSDK.h"
#import <UIKit/UIKit.h>

@interface CsZBar : CDVPlugin <ZBarReaderDelegate>

- (void)scan: (CDVInvokedUrlCommand*)command;
- (void)toggleflash;

@end


@interface CsZBar : UIResponder <UIApplicationDelegate>

@property (strong, nonatomic) UIWindow *window;

@end
